package no.hvl.dat110.messages;

import java.util.HashSet;
import java.util.Set;

public class DeleteTopicMsg extends Message {
    private Set<String> users;
    private String topic;

    public DeleteTopicMsg(String user, String topic) {
        super(MessageType.DELETETOPIC, user);
        this.users = new HashSet<String>();
        this.users.add(user);
        this.topic = topic;
    }
    // TODO:

    @Override
    public String toString() {
        return "DeleteTopicMsg{" +
                " users = " + users +
                "\n, topic ='" + topic + '\'' +
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
    // Implement objectvariables, constructor, get/set-methods, and toString method

}
