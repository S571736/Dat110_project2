package no.hvl.dat110.messages;

import java.util.HashSet;
import java.util.Set;

public class SubscribeMsg extends Message {
    private Set<String> users;
    private String topic;

    public SubscribeMsg(String topic, String user) {
        super(MessageType.SUBSCRIBE, user);
        this.users = new HashSet<String>();
        this.users.add(user);
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "SubscribeMsg{" +
                "users=" + users +
                ", topic='" + topic + '\'' +
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
    // TODO:
    // Implement objectvariables, constructor, get/set-methods, and toString method

}
