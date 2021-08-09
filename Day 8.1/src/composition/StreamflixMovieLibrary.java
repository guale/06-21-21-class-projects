package composition;

import java.util.List;

public class StreamflixMovieLibrary {

	private final List<StreamflixMovie> movies;
	StreamflixMovieLibrary(List<StreamflixMovie> movies){
		this.movies=movies;
	}
	public List<StreamflixMovie> getTotalStreamflixMoviesInStreamflixLibrary(){
		return movies;
	}
}
