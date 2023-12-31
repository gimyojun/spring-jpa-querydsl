package com.ll.springjpaquerydsl.domain.article.article.service;

import com.ll.springjpaquerydsl.domain.article.article.entity.Article;
import com.ll.springjpaquerydsl.domain.article.article.repository.ArticleRepository;
import com.ll.springjpaquerydsl.global.rsData.RsData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    @Transactional
    public RsData<Article> write(String title, String body) {
        Article article = Article.builder()
                .title(title)
                .body(body)
                .build();

        articleRepository.save(article);

        return RsData.of("200", "%d번 게시글이 작성되었습니다.".formatted(article.getId()), article);

    }
}