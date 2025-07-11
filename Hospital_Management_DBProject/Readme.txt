						Project WorkFlow

Entities in project :-

*********************Doctor*************************

Attributes- 
int dId,exp;
String name,address,email,spl;

Admin Controller Services:

1.Save Doctor;
2.Retrieve Doctor by id;
3.Delete Doctor by id;
4.Delete All Doctors;

*********************Patient*************************

Attributes:- 
int pId,age,contact_No;
String f_Name,l_Name,address,deasis,gender;

Admin Controller Services:

1.Save Patient;
2.Retrieve Patient by id;
3.Delete Patient by id;
4.Delete All Patient;

*********************Appointment*********************

Attributes:- 

int aId,pId,dId;
String ap_Date,ap_Time,reason_F_Visit,status;

Admin Controller Services:

1.Save Appointment;
2.Retrieve Appointment by id;
3.Delete Appointment by id;
4.Delete All Appointment;

**********************Staff************************

Attributes:- 
int sId,contact_No;
String f_Name,l_Name,address,email,gender,d_joing,designation,depart_Name;
//designation:- Nurse,Receptionist,Admin,Technician;

Admin Controller Services:

1.Save Staff;
2.Retrieve Staff by id;
3.Delete Staff by id;
4.Delete All Staff;


