fetch('https://api.scryfall.com/cards/search?order=cmc&q=type%3Aelf+color%3DWG&dir=desc')
  .then(response => response.json())
  .then(json => console.log(json))