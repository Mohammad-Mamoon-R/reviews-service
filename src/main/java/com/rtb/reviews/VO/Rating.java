package com.rtb.reviews.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating {

    private Long ratingId;
    private Long reviewerId;
    private Long bookId;
    private int rating;
}