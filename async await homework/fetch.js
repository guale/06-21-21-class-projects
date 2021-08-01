async function getCity(cityName){
	let response = await fetch(`https://geocode.xyz/${cityName}?json=1`);

	if(response.ok){
		let json = await response.json();
		console.log(`City coordinates: ${json.latt}, ${json.longt}`)
	} else {
		console.log(`HTTP-Error: ${response.status}`)
	}
}