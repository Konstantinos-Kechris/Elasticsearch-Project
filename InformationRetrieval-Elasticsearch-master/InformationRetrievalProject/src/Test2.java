public class Test2 {

    public static void main(String [] args) {

        String text = "\tnetCommons network infrastructure as commons Communication and information distribution are key components of a modern society. The advent of the Internet has been often invoked as a remedy for their democratization. The truth shows a different picture: the digital divide is widening the gap between those who can access and take advantage of the new systems, and those who remain disconnected.\\nThe Internet’s unsustainability, coupled with the lack of awareness of the actual complexity of the Internet’s organisation, means that users are mostly unaware of the potentials of digital interaction and, most of all, of the possibility to have a bottom-up, democratic, communal organisation of it. netCommons studies an emerging trend: community-based networking and services that can offer a complement to the global Internet’s model. Community networks not only offer to citizens the access to a neutral, network infrastructure, which naturally increases the transparency of data flow, storage and use, but they also represent the archetype of networked collective cooperation and action. Community networks are complex systems that require multiple skills to thrive: technical, legal, socio-economic, and more. They face many challenges and they need means and tools to grow and produce a higher impact on society.  netCommons follows a dual approach to achieve its goals: 1) It works at a local level, mingling with the communities to gather relevant information, elaborate it, and return them advanced tools to grow and thrive; 2) Starting from the hands-on experience and work, it contributes to Internet Science by abstracting concepts: it studies and offers solutions and interpretations, that can be used by legislators and decision makers, to build global awareness of the importance of sustainability, participation, co-operation, on-line information, democracy, peer production, and how to foster the development of community networks to generate socio-economical opportunities based on this paradigm of Internet Science.";
        String t2 = text.replace("\n", "");
        t2 = t2.replaceAll("\\W+"," ");
        System.out.println(t2);

    }

}
