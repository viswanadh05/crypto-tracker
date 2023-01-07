/* Viswanadh Bhaskarla - Tracker app | Spring MVC | coinrank API Integration */

package com.vish.trackerapp.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.vish.trackerapp.TrackerConfigProperties;
import com.vish.trackerapp.model.CoinDTO;

import jakarta.annotation.PostConstruct;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Service
@EnableConfigurationProperties(TrackerConfigProperties.class)
@RequestMapping("/secret")
public class APIService {
		
	private List<CoinDTO> coinList = new ArrayList<>();
	
	private final TrackerConfigProperties trackerConfig;
	
	//Injecting configuration properties into the constructor.
	public APIService(TrackerConfigProperties trackerConfig) {
		this.trackerConfig = trackerConfig;
	}
	
	public List<CoinDTO> getCoinList() {
		return coinList;
	}

	public void setCoinList(List<CoinDTO> coinList) {
		this.coinList = coinList;
	}
	
	@PostConstruct
	@Scheduled(cron = "* * 1 * * *")
	public void getAPIData() throws IOException, JSONException{		
		List<CoinDTO> newData = new ArrayList<>();
		OkHttpClient client = new OkHttpClient();
		
		JSONObject obj = null;
		JSONObject data = null;

		//Use request builder to configure api 
		Request request = new Request.Builder()
			.url(trackerConfig.apiUrl())
			.get()
			.addHeader("X-RapidAPI-Key", trackerConfig.apiKey())
			.addHeader("X-RapidAPI-Host", trackerConfig.apiHost())
			.build();
		
		Response response = null;
		
		try {
			response = client.newCall(request).execute();
						
			String jsonResponse = response.body().string();
			System.out.println(jsonResponse);

			
			obj = new JSONObject(jsonResponse);
			data = obj.getJSONObject("data");
			JSONArray arr = data.getJSONArray("coins");
						
			System.out.println(arr);
			
			for(int i=0; i<arr.length(); i++) {
				CoinDTO coinRecords = new CoinDTO();
				coinRecords.setName(arr.getJSONObject(i).getString("name"));
				coinRecords.setSymbol(arr.getJSONObject(i).getString("symbol"));
				coinRecords.setPrice(arr.getJSONObject(i).getFloat("price"));
				coinRecords.setRank(arr.getJSONObject(i).getInt("rank"));
				coinRecords.setChange(arr.getJSONObject(i).getFloat("change"));
				coinRecords.setUrl(arr.getJSONObject(i).getString("iconUrl"));
				coinRecords.setMarketCap(arr.getJSONObject(i).getString("marketCap"));
				newData.add(coinRecords);
			}
			this.coinList = newData;
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		// Requesting response.body().string() more than once will cause illegal state exception. 	
	}
}
