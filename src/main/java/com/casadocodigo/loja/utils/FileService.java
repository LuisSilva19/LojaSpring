package com.casadocodigo.loja.utils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.casadocodigo.loja.domain.Attachment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FileService {
/*
	private final AmazonS3 amazonS3;
	private static final String BUCKET="[NOME DO MEU BUCKET]";

	public Attachment write(MultipartFile file) {
		byte[] content = new byte[0];

		try {
			content = file.getBytes();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return createAttachment(content,file.getOriginalFilename());
	}

	private void upload(PutObjectRequest request) {
		try {
			amazonS3.putObject(request);
		} catch (AmazonClientException cause) {
			throw new RuntimeException("Could not upload file", cause);
		}
	}

	private PutObjectRequest request(ByteArrayOutputStream bytes, String bucket, String key, String contentType) {
		return new PutObjectRequest(bucket, key, stream(bytes), metadata(bytes, contentType));
	}

	private InputStream stream(ByteArrayOutputStream bytes) {
		return new ByteArrayInputStream(bytes.toByteArray());
	}

	private ObjectMetadata metadata(ByteArrayOutputStream bytes, String contentType) {
		ObjectMetadata metadata = new ObjectMetadata();
		metadata.setContentLength(bytes.size());
		metadata.setContentType(contentType);
		return metadata;
	}

	private Attachment attachment(String fileName, String key, String contentType) {
		return Attachment.builder()
				.key(key)
				.bucket(BUCKET)
				.contentType(contentType)
				.fileName(fileName)
				.build();
	}


	private ByteArrayOutputStream stream(byte[] bytes) {
		ByteArrayOutputStream stream = new ByteArrayOutputStream(bytes.length);
		try {
			stream.write(bytes);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return stream;
	}

	private Attachment createAttachment(byte[] bytes, String defaultFileName) {
		String key = UUID.randomUUID().toString();
		String contentType = "application/pdf";

		upload(request(stream(bytes), BUCKET, key, contentType));

		return attachment(defaultFileName, key, contentType);
	}
*/
}









