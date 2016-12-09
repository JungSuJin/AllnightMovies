package com.allnightMovies.model.data.movieInfo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieReviewBoard {
	private String reviewContents;
	private String movieTitle;
	private String userID;
	private int reviewEvaluate;
	private Date writeDate;
}
