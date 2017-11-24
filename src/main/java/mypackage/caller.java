package mypackage;

import am.ik.aws.apa.AwsApaRequester;
import am.ik.aws.apa.AwsApaRequesterImpl;
import am.ik.aws.apa.jaxws.ItemLookupRequest;
import am.ik.aws.apa.jaxws.ItemLookupResponse;
import am.ik.aws.apa.jaxws.ItemSearch;
import am.ik.aws.apa.jaxws.ItemSearchRequest;
import am.ik.aws.apa.jaxws.ItemSearchResponse;
import am.ik.aws.apa.*;

public class caller extends AwsApaRequesterImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AwsApaRequester requester = new AwsApaRequesterImpl();
		ItemSearchRequest request = new ItemSearchRequest();
		request.setSearchIndex("Books");
		request.setKeywords("Java");
		ItemSearchResponse response = requester.itemSearch(request);
		
		
		//AwsApaRequester requester = new AwsApaRequesterImpl();
		//ItemSearchRequest request = new ItemSearchRequest();
		//request.setSearchIndex("Books");
		//request.setKeywords("Java");
		//ItemSearchResponse response = requester.itemSearch(request);
		///System.out.println(requester.itemSearch(request));
		//System.out.println(request);
		//System.out.println(response);
	}
}
