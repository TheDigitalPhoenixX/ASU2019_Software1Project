package com.company.prototyping;

import com.company.cinema.ViewingOption;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class APIData {

    // region Variables
    @SerializedName("imdbID")
    @Expose()
    private String imdbID;
    @SerializedName("Poster")
    @Expose()
    private String poster;
    @SerializedName("Trailer")
    @Expose()
    private String trailer;
    @SerializedName("available")
    @Expose()
    private boolean available;
    @SerializedName("viewingOptions")
    @Expose()
    private ViewingOption[] viewingOptions;

    // endregion Variables

    // region Constructor
    public APIData(String imdbID, String poster, String trailer) {
        this.imdbID = imdbID;
        this.poster = poster;
        this.trailer = trailer;
    }
    // endregion Constructor

    // region accessors

    public String getImdbID() {
        return imdbID;
    }

    public String getPoster() {
        return poster;
    }

    public String getTrailer() {
        return trailer;
    }

    public boolean isAvailable() {
        return available;
    }

    public ViewingOption[] getViewingOptions() {
        return viewingOptions;
    }

    // endregion accessors

    // region mutators

    public void setImdbID(String imdbID) {
        this.imdbID = imdbID;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setViewingOptions(ViewingOption[] viewingOptions) {
        this.viewingOptions = viewingOptions;
    }
    // endregion mutators
}
