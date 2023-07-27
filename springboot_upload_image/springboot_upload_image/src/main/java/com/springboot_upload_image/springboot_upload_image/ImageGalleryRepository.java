package com.springboot_upload_image.springboot_upload_image;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ImageGalleryRepository extends JpaRepository<ImageGallery, Long>{

	Optional<ImageGallery> findById(int id);

}

