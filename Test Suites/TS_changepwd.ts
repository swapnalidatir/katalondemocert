<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TS_changepwd</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>7f7b7ae0-d5cd-49d7-a323-2a80dfaaf9fa</testSuiteGuid>
   <testCaseLink>
      <guid>282fc447-f665-48e6-8a58-162058265d3b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Tc7_VerifyPassword validation</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>1971fb4e-fae6-459e-9acc-24cac8520e63</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Passworddata</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>1971fb4e-fae6-459e-9acc-24cac8520e63</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>invalid_current_pwd</value>
         <variableId>2ef7ba62-551d-42ea-8d53-5dd2944b4638</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1971fb4e-fae6-459e-9acc-24cac8520e63</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>c4008ec5-8627-4655-8223-6c3819913e4c</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1971fb4e-fae6-459e-9acc-24cac8520e63</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>confirmpassword</value>
         <variableId>c9b4bac4-cb53-4443-83c9-7cd96983c365</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>8c4cfd40-b196-4248-94e5-3dd2a2a4b042</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Tc6_Verify Change password</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>0f83218f-d03f-4f95-83ec-4ebbacda3d98</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Passworddata</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>0f83218f-d03f-4f95-83ec-4ebbacda3d98</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>currentpassword</value>
         <variableId>daf72d06-aa88-4804-8697-b34fda26cd26</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>0f83218f-d03f-4f95-83ec-4ebbacda3d98</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>dfddfb4d-d0ac-4948-a880-3825a4f5a92c</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>0f83218f-d03f-4f95-83ec-4ebbacda3d98</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>confirmpassword</value>
         <variableId>2c2df994-25a0-4542-bbd4-093472298c8d</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
