package com.example.post.user.db;

import com.example.post.user.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    // select * from user where score >= [??]
    List<UserEntity> findAllByScoreGreaterThanEqual(int score);

    // select * from user where score >= ?? AND score <= ??
    List<UserEntity> findAllByScoreGreaterThanEqualAndScoreLessThanEqual(int min, int max);

    @Query(
            value = "select * from user as u where u.score >= :min AND u.score <= :max",
            nativeQuery = true
    ) // 쿼리 직접 작성 하는 방식
    // List<UserEntity> score(int min, int max);
    List<UserEntity> score(@Param(value = "min") int min, @Param(value = "max") int mqx);
}
