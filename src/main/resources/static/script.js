//Viswanadh Bhaskarla - Tracker app | Spring MVC | coinrank API Integration

//JS Function to display negative values in red color and positive values in green color
function redText() {
	var elements = document.getElementsByTagName('pre')
	for (i = 0; i < elements.length; i++) {
		if (elements[i].innerHTML < 0) {
			elements[i].classList.add('currency-neg');
		}
		;
	}
}

//JS Function to display numbers formatted with commas for every 3 digits.
function numberWithCommas() {
	var elements = document.getElementsByTagName('p')
	for (i = 0; i < elements.length; i++) {
		//element.innerHTML = newHTML;
		elements[i].innerHTML = elements[i].innerHTML.toString().replace(
			/\B(?=(\d{3})+(?!\d))/g, ",");
	}
}

//JS Function to search results by coin name.
function myFunction() {
	// Declare variables
	var input, filter, table, tr, td, i, txtValue;
	input = document.getElementById("myInput");
	filter = input.value.toUpperCase();
	table = document.getElementById("myTable");
	tr = table.getElementsByTagName("tr");

	// Loop through all table rows, and hide those who don't match the search query
	for (i = 0; i < tr.length; i++) {
		td = tr[i].getElementsByTagName("td")[1];
		if (td) {
			txtValue = td.textContent || td.innerText;
			if (txtValue.toUpperCase().indexOf(filter) > -1) {
				tr[i].style.display = "";
			} else {
				tr[i].style.display = "none";
			}
		}
	}
}