package demo.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import demo.domain.Word;

/**
 * NounClient
 */
@FeignClient("ARTICLE")
public interface ArticleClient {
    
    @GetMapping("/")
	public Word getWord();
}