package no.hvl.dat110.messages;

import java.util.HashSet;
import java.util.Set;

public class PublishMsg extends Message {
    private Set<String> users;
    private String topic;
    private String message;

    public PublishMsg(String user, String topic, String message) {
        super(MessageType.PUBLISH, user);
        this.users = new HashSet<String>();
        this.users.add(user);
        this.topic = topic;
        this.message = message;
    }

    @Override
    public String toString() {
        return "PublishMsg{" +
                " users=" + users +
                ", topic='" + topic + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public Set<String> getUsers() {
        return users;
    }

    public void setUsers(Set<String> users) {
        this.users = users;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    // TODO:
    // Implement objectvariables, constructor, get/set-methods, and toString method

}
