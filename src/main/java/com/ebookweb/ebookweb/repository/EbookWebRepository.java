package com.ebookweb.ebookweb.repository;

import com.ebookweb.ebookweb.domain.EbookWeb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EbookWebRepository extends JpaRepository< EbookWeb, Long> {
}
