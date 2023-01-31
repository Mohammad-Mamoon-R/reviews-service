package com.rtb.reviews.VO;

import com.rtb.reviews.entity.Review;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private List<Rating> rating;
    private List<Review> review;
}
