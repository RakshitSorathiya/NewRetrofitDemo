package demo.android.newretrofitdemo.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class MoviesResponse {
    @SerializedName("page")
    private int page;
    @SerializedName("results")
    private List<demo.android.newretrofitdemo.model.Movie> results;
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("total_pages")
    private int totalPages;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<demo.android.newretrofitdemo.model.Movie> getResults() {
        return results;
    }

    public void setResults(List<demo.android.newretrofitdemo.model.Movie> results) {
        this.results = results;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
