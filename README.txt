
About the showmyoffers web app:
--------------------------------
showmyoffers is a grails web app, it can be accessed by running grails run-app and opening http://localhost:8080/showmyoffers
The basic idea behind the web app is to provide the customer with the ability to get periodic top ten offers/deals emails based on their prefered products
The web interface has the page for the customer to put in the products which they are looking for offers along with the emailid's to send offer emails
The web app runs a scheduled job every day to make calls to http://api.target.com/v2/items target api inorder to get the top 10 offers
