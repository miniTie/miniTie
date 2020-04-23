package com.microcyber.mccloud.buziness.message.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "mc_message")
public class McMessage implements Serializable {
//sdgdds
    //vvvdfsgdg
    付电话费
    =sdavda
    @Id
    @Column(name = "message_id")
    private Long messageId;

    @Column(name = "message_content")
    private String messageContent;

    @Column(name = "message_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+8")
    private Date messageTime;

    @Column(name = "message_read")
    private int messageRead;

    @Column(name = "message_type")
    private int messageType;

    @Column(name = "user_id")
    private Long userId;


    @Column(name = "message_remark")
    private String messageRemark;

    public Long getMessageId() {
        return messageId;
    }

    public void setMessageId(Long messageId) {
        this.messageId = messageId;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public Date getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(Date messageTime) {
        this.messageTime = messageTime;
    }

    public int getMessageRead() {
        return messageRead;
    }

    public void setMessageRead(int messageRead) {
        this.messageRead = messageRead;
    }

    public int getMessageType() {
        return messageType;
    }

    public void setMessageType(int messageType) {
        this.messageType = messageType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getMessageRemark() {
        return messageRemark;
    }

    public void setMessageRemark(String messageRemark) {
        this.messageRemark = messageRemark;
    }
}
