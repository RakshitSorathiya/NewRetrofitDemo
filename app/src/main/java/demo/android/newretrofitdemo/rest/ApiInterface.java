package demo.android.newretrofitdemo.rest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by ln-149 on 7/2/17.
 */

public interface ApiInterface {

    @GET("movie/top_rated")
    Call<demo.android.newretrofitdemo.model.MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("movie/{id}")
    Call<demo.android.newretrofitdemo.model.MoviesResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}
