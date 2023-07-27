package com.pixeltrice.springbootimagegalleryapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageGalleryRepository extends JpaRepository<ImageGallery, Long>{

}