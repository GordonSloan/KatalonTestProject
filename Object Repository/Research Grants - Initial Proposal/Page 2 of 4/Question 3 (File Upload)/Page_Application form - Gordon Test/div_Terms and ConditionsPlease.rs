<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Terms and ConditionsPlease</name>
   <tag></tag>
   <elementGuidId>39fb56be-7ebf-42d8-be08-e93defe09f7d</elementGuidId>
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
      <value>MainContent_ctl00_ucFormItems_ctl02_pnlFormItem</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>fx-fullcolumnformitem form-object form-item-upload  FileUpload  FileUpload  FileUpload  FileUpload  FileUpload</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>formitemid</name>
      <type>Main</type>
      <value>641465</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>fiid</name>
      <type>Main</type>
      <value>641465</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>qbid</name>
      <type>Main</type>
      <value>367984</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
		

    
			
        Terms and Conditions
Please upload the most recent copy of your organisations Terms and Conditions.
    
		

    
        
    

    
        



    $(document).ready(function() {
        
         $(&quot;#files_MainContent_ctl00_ucFormItems_ctl02_uploadControl&quot;).kendoUpload({
            localization: {
                &quot;cancel&quot;: &quot;Cancel&quot;,
                &quot;clearSelectedFiles&quot;: &quot;Clear&quot;,
                &quot;dropFilesHere&quot;: &quot;or drag and drop files here to upload&quot;,
                &quot;headerStatusUploaded&quot;: &quot;Done&quot;,
                &quot;headerStatusUploading&quot;: &quot;Uploading...&quot;,
                &quot;invalidFileExtension&quot;: &quot;File type not allowed.&quot;,
                &quot;invalidFiles&quot;: &quot;Invalid file(s). Please check file upload requirements.&quot;,
                &quot;invalidMaxFileSize&quot;: &quot;File size too large.&quot;,
                &quot;invalidMinFileSize&quot;: &quot;File size too small.&quot;,
                &quot;remove&quot;: &quot;Remove&quot;,
                &quot;retry&quot;: &quot;Retry&quot;,
                &quot;select&quot;: &quot;Choose your file(s)&quot;,
                &quot;statusFailed&quot;: &quot;failed&quot;,
                &quot;statusUploaded&quot;: &quot;uploaded&quot;,
                &quot;statusUploading&quot;: &quot;uploading&quot;,
                &quot;uploadSelectedFiles&quot;: &quot;Upload&quot;
            },
            async: {
                saveUrl: &quot;/GenericControls/UploadFile.ashx&quot;,
                autoUpload: true
            },
            enabled: true,
            multiple: true,
            showFileList: false,
            select: function(e) {
            },
            upload: function(e) { UploadDocument(e, &quot;Document&quot;, &quot;Add&quot;, &quot;44648&quot;, &quot;10616109&quot;, &quot;804&quot;, &quot;True&quot;); },
            error: function(e) { DocumentUploadError(e); },
            success: function(e) { RefreshGrid(e,&quot;MainContent_ctl00_ucFormItems_ctl02_uploadControl&quot;); }
        });

        var postData = new Object();
        postData.EntityTypeId = 44648;
        postData.EntityRowId = 10616109;
        $(&quot;#documentUploadGrid_MainContent_ctl00_ucFormItems_ctl02_uploadControl&quot;)[0].postData = postData;
        
        $(&quot;#documentUploadGrid_MainContent_ctl00_ucFormItems_ctl02_uploadControl&quot;).kendoGrid({
            dataSource: {
                transport: {
                    read: { type: &quot;POST&quot;, url: &quot;/WebServices/DocumentService.svc/GetDocuments&quot;, dataType: &quot;json&quot;, contentType: &quot;application/json&quot;, data: $(&quot;#documentUploadGrid_MainContent_ctl00_ucFormItems_ctl02_uploadControl&quot;)[0].postData },
                    parameterMap: function(data, operation) { return JSON.stringify(data); }
                },
                schema: { data: DocUploadParseResult, type: &quot;json&quot; }
            },
            columns: [
                { field: &quot;FileName&quot;, title: &quot;File name&quot;, sortable: true, template: '&lt;a href=&quot;/downloadfile.aspx?dsid=#=DocumentID#&quot; target=&quot;_blank&quot;>#=FileName#&lt;/a>', width: 250  },
                { field: &quot;DateCreated&quot;, title: &quot;Date uploaded&quot;, sortable: true, width: 200 } ,{ title: &quot;Action&quot;, width: 80, command: { name: &quot;destroy&quot;, text: &quot;Delete&quot;, click: function() { $(&quot;#documentUploadGrid&quot;).kendoGrid.removeRow($(this)); }} }
            ],
            sortable: true,
            editable: {
                mode: &quot;inline&quot;,
                confirmation: &quot;Are you sure that you want to delete this file?&quot;,
                cancelDelete: &quot;Cancel&quot;,
                confirmDelete: &quot;OK&quot;
            },
            pageable: false,
            scrollable: false,
            autoBind: true,

            remove: function(e) {

                $.ajax({
                    type: &quot;POST&quot;,
                    url: &quot;/WebServices/DocumentService.svc/DeleteDocument&quot;,
                    data: '{&quot;documentStoreId&quot;: &quot;' + e.model.DocumentID + '&quot;}',
                    contentType: &quot;application/json; charset=utf-8&quot;,
                    dataType: &quot;json&quot;,
                    success: function(msg) {
                        showNotification({
                            type: &quot;success&quot;,
                            message: &quot;The document was successfully deleted&quot;,
                            autoClose: true,
                            duration: 4
                        });
                    },
                    error: function(msg) {
                        showNotification({
                            type: &quot;error&quot;,
                            message: &quot;An error occurred while deleting the document, please try again&quot; + JSON.stringify(msg),
                            autoClose: false
                        });
                    }
                });

            }
        });

    });
    
    function DocUploadParseResult (result) {
        var data = JSON.parse(result.d);
        return data;
    }

    function DocumentUploadError(e) {
        showNotification({
            type: &quot;error&quot;,
            message: &quot;There was an error uploading your file : &quot; + e.XMLHttpRequest.responseText,
            autoClose: false,
            duration: 7
        });
    }

    function UploadDocument(e, uploadType, commandType, entityTypeId, entityRowId, documentCategoryId, includeApplicationstage) {
        e.data = { UploadType: uploadType, CommandType: commandType, EntityTypeId: entityTypeId, EntityRowId: entityRowId, DocumentCategoryId: documentCategoryId, IncludeApplicationStage: includeApplicationstage };
    }

    function RefreshGrid(e,controlId) {
        if(e.response.Result == true){
            var documentName = e.response.ResultDetail.DocumentName;
            var tempgrid = $(&quot;#documentUploadGrid_&quot; + controlId).data(&quot;kendoGrid&quot;);
            tempgrid.dataSource.read();
            tempgrid.refresh();

            showNotification({
                type: &quot;success&quot;,
                message: &quot;Your document ' &quot; + [documentName] + &quot; ' has been successfully uploaded&quot;,
                autoClose: true,
                duration: 4
            });
        } else {
            showNotification({
                type: &quot;error&quot;,
                message: e.response.ResultMessage,
                autoClose: true,
                duration: 4
            });
        }
    }
    




    
    



    

    
			
        
    
		
    
    
    

		

	</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;MainContent_ctl00_ucFormItems_ctl02_pnlFormItem&quot;)</value>
   </webElementProperties>
</WebElementEntity>
