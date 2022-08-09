package com.ayyappan.imagegallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayyappan.imagegallery.entity.ImageGallery;


@Repository
public interface ImageGalleryRepository extends JpaRepository<ImageGallery, Long>{

}

