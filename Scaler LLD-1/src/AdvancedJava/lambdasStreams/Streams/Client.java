package AdvancedJava.lambdasStreams.Streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {

        List<Integer> list=List.of(12,2,3,15,18,7,99);
        Stream<Integer> stream=list.stream();

        List<Integer> evenElements=stream.filter((ele) -> ele%2==0)
                .collect(Collectors.toList());

        //we cannot use again and again, we have to use another stream
        Stream<Integer> stream1=list.stream();
        List<Integer> eventens=stream1.filter((ele)->ele%2==0)
                        .sorted().map(ele->ele*10).collect(Collectors.toList());


        //we cannot use again and again, we have to use another stream
        Stream<Integer> stream2=list.stream();
        // we have to conver it as optional because there is chance the first element is not at all available in the list
        Optional<Integer> getFirst=stream2.filter((ele)->ele%2==0)
                .sorted().map(ele->ele*10).findFirst();

        System.out.println(evenElements);
        System.out.println(eventens);
        System.out.println(getFirst);

    }
}
