package com.casadocodigo.loja;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class LojaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaApplication.class, args);

		/*
		BasicAWSCredentials creds = new BasicAWSCredentials("AKIATDMEJMNQ3NO43R4S", "lJf0v0z1xS+OGAPFTOY7r1rXbHiqL5I+TsZpmhD9");

		AmazonS3 amazonS3 = AmazonS3Client.builder()
				.withRegion("us-east-1")
				.withCredentials(new AWSStaticCredentialsProvider(creds))
				.build();

		List<Bucket> buckets = amazonS3.listBuckets();
		buckets.forEach(b -> System.out.println(b.getName() + " " + b.getOwner()));
		*/
	}

}
