<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Add person from our contac</name>
   <tag></tag>
   <elementGuidId>ee82f0c7-966a-4278-ad21-9cc46bb7322d</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>MainContent_ctl00_ucFormItems_ctl00_pnlFormItem</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>formEntityItem form-object form-item-application-contact </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>fiid</name>
      <type>Main</type>
      <value>641452</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
				
    
        
            
                
                    Add person from our contacts
            
        
        

    
    
        
            
					
						
							select
						
					select
				
        
        
    
    
    



    function OnClientFocus(sender, args) {
        FlexiJS.Browser.GoogleAnalytics.EventTracking('event', 'Search', 'Focus', 'CRM Search');
    }



        
    
    
    
    
        
					
            
                Please enter any contacts associated with this application.
            
        
				
        
            
                
					
                    You must add at least 1 contact(s) with a full name, contact type, complete address, phone number and email specified.
                
				
            
            
                

				
					
		
		
		
		
		
		
		
		
	

						
							 contact namecontact typephoneemailaddress complete  
						
					
					
						
                                    
                                    
                                    

                                        
                                    
                                Test UserPrimary Applicant 
                                    test.user@sharklasers.com
                                NoEdit
					
					

				

					
				
            

            
                
            
            
                
                    
                        Add more contacts
                
            
            
            
        
        
					
            
        
				
    
    
    

				
    
        Sys.Application.add_load(
            function () {
                DoInitaliseFormValidation(false);
            });
        function refreshContactsGrid() {
            $find(&quot;ctl00_MainContent_ctl00_ucFormItems_ctl00_rgContacts&quot;).get_masterTableView().rebind();
        }
    

			</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;MainContent_ctl00_ucFormItems_ctl00_pnlFormItem&quot;)</value>
   </webElementProperties>
</WebElementEntity>
