package com.webfilm.anime.dao;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.query.Param;

import com.webfilm.anime.entity.Movie;
import com.webfilm.anime.entity.MovieGenres;
import com.webfilm.anime.entity.Review;

public interface ReviewDao extends JpaRepositoryImplementation<Review, UUID>{

	@Query(value = "select * from  review where movie_id=:movieId\r\n"
			+ "",nativeQuery = true)
	public List<Review> listReviewByMovie(@Param("movieId") UUID movieId);
	@Query(value = ";WITH x AS\r\n"
			+ "(\r\n"
			+ "    -- anchor:\r\n"
			+ "    SELECT  review_id,user_id , comment,created_at,status,movie_id, blog_id,count_like,review_reply\r\n"
			+ "    FROM review WHERE review_reply =:replyId\r\n"
			+ "    UNION ALL\r\n"
			+ "    -- recursive:\r\n"
			+ "    SELECT t.review_id, t.user_id, t.comment, t.created_at,t.status,t.movie_id, t.blog_id,t.count_like,t.review_reply\r\n"
			+ "    FROM x INNER JOIN review AS t\r\n"
			+ "    ON t.review_reply = x.review_id\r\n"
			+ ")\r\n"
			+ "SELECT x.review_id,x.user_id , x.comment,x.created_at,x.status,x.movie_id,x.blog_id,x.count_like,x.review_reply FROM x",nativeQuery = true)
	public List<Review> listReviewAndReplies(@Param("replyId")UUID replyId);
	@Query(value = "select *from review where review_reply is null and blog_id=:blogId",nativeQuery = true)
	public List<Review> listComment(@Param(value = "blogId")UUID blogId);
	@Query(value = "select count(*) from  review where review_reply =:replyId\r\n"
			+ "",nativeQuery = true)
	public int countReviewByMovie(@Param("replyId") UUID movieId);
}
