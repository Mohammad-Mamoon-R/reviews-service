package com.rtb.reviews.controller;

import com.rtb.reviews.VO.ResponseTemplateVO;
import com.rtb.reviews.entity.Review;
import com.rtb.reviews.service.ReviewService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reviews")
@Slf4j
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/addReview")
    public Review saveReview(@RequestBody Review review) {
        log.info("Inside saveReview method of ReviewController");
        return  reviewService.saveReview(review);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO findReviewByBookId(@PathVariable("id") Long bookId) {
        log.info("Inside findReviewByBookId method of ReviewController");
        return reviewService.findReviewByBookId(bookId);
    }

}
