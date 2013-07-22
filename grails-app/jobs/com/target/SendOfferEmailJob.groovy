package com.target
import com.target.OfferSlurper
import wslite.rest.*

class SendOfferEmailJob {

private static final API_BASE = 'http://api.target.com'

def static restClient = null

static {

 restClient = new RESTClient(API_BASE)
 //restClient.httpClient.sslTrustAllCerts = true
}

    static triggers = {
    //simple repeatInterval: 24 * 3600 * 1000 //execute every day
      simple repeatInterval: 30000 // execute job once in 30 seconds
    }

    def execute() {
    println '!!!!!!!!-----------Running SendOfferEmailJob---------------!!!!!!!!!!!!!'
    def offerSlupers = OfferSlurper.list()
    offerSlupers.each{
    def email = it.email
    def productKeyword = it.productKeyword
    def offers = 
    println 'email: ' + email
    //get the offers
    
def response = restClient.get(path:'/v2/items', query:[Keywords:productKeyword, ResponseGroups:'Offers', Count:10, key:'AgbfHKDWglSKhP8ywvBI4FDDGdCEFdJa'])
println 'response: ' + response.xml
       
    //send email
    
    //have to write code to send email but 
    
    }
        
    }
}
