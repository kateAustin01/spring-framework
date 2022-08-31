package com.cydeo.proxy;

import com.cydeo.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
@Qualifier("EMAIL")
public class EmailCommentNotification implements CommentNotificationProxy{
    @Override

    public void sendComment(Comment comment){
        System.out.println("Sending notification from comment: " + comment.getText());
    }
}
