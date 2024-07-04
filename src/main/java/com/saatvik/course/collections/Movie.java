package com.saatvik.course.collections;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Movie implements Comparable<Movie>{
    String name;
    Integer rating;
    String actor;
    String actress;

    @Override
    public int compareTo(Movie movie) {
        return this.rating.compareTo(movie.getRating());
    }
}
