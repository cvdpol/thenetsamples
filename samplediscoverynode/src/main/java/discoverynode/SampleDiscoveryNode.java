package discoverynode;


import com.thenet.abstractnode.member.MemberInformation;
import com.thenet.discoverynode.DiscoveryNode;
import com.thenet.discoverynode.listener.MemberListener;

public class SampleDiscoveryNode extends DiscoveryNode implements MemberListener {

    public SampleDiscoveryNode() {
        super("SampleDiscoveryNode", 0);
    }

    public static void main(String[] args) {
        new SampleDiscoveryNode();
    }

    @Override
    public void memberAdd(MemberInformation memberInformation) {
        System.err.println("-----> Added: " + memberInformation.getNodetype().name());
        System.err.println("-----> Added: " + memberInformation.getName());
        System.err.println("-----> Added: " + memberInformation.getVersion());
        System.err.println("-----> Added: " + memberInformation.getSubscribedTopics());

    }

    @Override
    public void memberRemoved(MemberInformation memberInformation) {
        System.err.println("-----> Removed: " + memberInformation.getNodetype().name());
        System.err.println("-----> Removed: " + memberInformation.getName());
        System.err.println("-----> Removed: " + memberInformation.getVersion());
        System.err.println("-----> Removed: " + memberInformation.getSubscribedTopics());

    }
}
