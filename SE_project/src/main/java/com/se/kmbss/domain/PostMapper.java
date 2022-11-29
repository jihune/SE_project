package com.se.kmbss.domain;


import org.apache.ibatis.annotations.Mapper;


@Mapper
 public interface PostMapper {
    /**
     * 게시글 저장
     * @param params - 게시글 정보
     */
    void save(PostRequest params);

    /**
     * 게시글 수정
     * @param params - 게시글 정보
     */
     void update(PostRequest params);

    /**
     * 게시글 상세정보 조회
     * @param id - PK
     * @return 게시글 상세정보
     */
    PostResponse findById(Long id);


}
