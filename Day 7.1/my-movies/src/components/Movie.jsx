import React from "react";

const Movie = ({ title, description, year, genre }) => {
	return (
		<div>
			<h3>{title}</h3>
			<h4>{description}</h4>
			<h4>{year}</h4>
			<h4>{genre}</h4>
		</div>
	);
};

export default Movie;
