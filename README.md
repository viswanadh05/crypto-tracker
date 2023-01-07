# Spring-boot-crypto-price-tracker
Java Spring boot project to get coin rank API data and display JSON response on UI

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->
## About The Project

<!-- [![Product Name Screen Shot][product-screenshot]](https://example.com) -->

A spring boot Java application to demonstrate the efficient use of spring boot uses and getting API data in JSON Format, reading it and displaying all the data on web page. 

This project can clearly project the use of packages, methods and different annotations used in spring boot. 

### Built With

* Spring IO 
* Java EE
* Bootstrap
* HTML

<!-- GETTING STARTED -->
## Getting Started

### Installation

1. Get your coinrank api keys from [Coinranking | RapidAPI](https://rapidapi.com/Coinranking/api/coinranking1/)
2. Clone the repo or import from eclipse
   ```sh
   git clone https://github.com/viswanadh05/Spring-MVC-with-API-Integration.git
   ```
3. Install Maven [Maven configure tutorial](https://www.toolsqa.com/maven/how-to-install-maven-eclipse-ide/)
   
4. Enter your API in `application.properties`
   ```properties
   secret.apiUrl=YOUR_API-URL
   secret.apiKey=YOUR_API_KEY
   secret.apiHost=YOUR_API_HOST

   ```

5. Run TrackerappApplication.java

<!-- USAGE EXAMPLES -->
## Usage

Use this space to show useful examples of how a project can be used. Additional screenshots, code examples and demos work well in this space. You may also link to more resources.

_For more examples, please refer to the [Documentation](https://example.com)_

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- ROADMAP -->
## Roadmap

- [x] Create spring boot project
- [x] Get Json Data from rapidAPI
- [x] Display data with Bootstrap 
- [x] Add API keys to application.properties and hide it from git repo
- [x] Add search bar
- [x] Format API results by currency, digits, percentage and dollar symbols, css styling
- [x] Add coin icons to the results
- [x] Add search bar
- [ ] Add validation to Json response (To avoid incorrect data formats)
- [ ] Connect a database to the application
- [ ] Add user authentication
- [ ] Add coin price watch list
- [ ] Add coin statistics with graphs


- [ ] Add a graph showing any searched coin stats

See the [open issues](https://github.com/othneildrew/Best-README-Template/issues) for a full list of proposed features (and known issues).

<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>
