package com.springboot_upload_image.springboot_upload_image;

import java.awt.Image;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ImageGalleryService {

	@Autowired
	private ImageGalleryRepository imageGalleryRepository;
	
	public void saveImage(ImageGallery imageGallery) {
		imageGalleryRepository.save(imageGallery);	
	}

	public List<ImageGallery> getAllActiveImages() {
		return imageGalleryRepository.findAll();
	}

	public Optional<ImageGallery> getImageById(Long id) {
		return imageGalleryRepository.findById(id);
	}
	public ImageGallery get(int id) {
		// TODO Auto-generated method stub
		return imageGalleryRepository.findById(id).get();
	}

		
	}



