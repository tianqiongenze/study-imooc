module com.myimooc.java.sms.runtime {
    requires com.myimooc.java.sms.service;
    requires com.myimooc.java.sms.filestore;

    uses com.myimooc.java.sms.service.StudentService;

}