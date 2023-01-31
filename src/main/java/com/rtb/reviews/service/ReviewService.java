package com.rtb.reviews.service;

import com.rtb.reviews.VO.Rating;
import com.rtb.reviews.VO.ResponseTemplateVO;
import com.rtb.reviews.entity.Review;
import com.rtb.reviews.repository.ReviewRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Slf4j
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;


    @Autowired
    private RestTemplate restTemplate;

    public Review saveReview(Review review) {
        log.info("Inside saveReview of ReviewService");
        return reviewRepository.save(review);
    }

    public ResponseTemplateVO findReviewByBookId(Long bookId) {
        log.info("Inside findReviewByBookId of ReviewService");
        List<Review> reviewList = reviewRepository.findByBookId(bookId);
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();


        responseTemplateVO.setReview(reviewList);


        List<Rating> rating =
                restTemplate.getForObject("http://RATING-SERVICE/ratings/" + bookId
                        , List.class);

        responseTemplateVO.setRating(rating);

        return  responseTemplateVO;
    }
}
