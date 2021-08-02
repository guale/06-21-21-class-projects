import logo from "./logo.svg";
import "./App.css";
import Collection from "./components/Collections";
import Movie from "./components/Movie";

function App() {
	return (
		<div className="App">
			<Collection title="Movies about stuff">
				<Movie
					title="No Country for Old Men"
					description="a movie about stuff"
					year="probably 2007"
					genre="thriller"
				/>
				<Movie
					title="The Big Lebowski"
					description="a movie about stuff"
					year="1998"
					genre="Noir"
				/>
			</Collection>
		</div>
	);
}

export default App;
