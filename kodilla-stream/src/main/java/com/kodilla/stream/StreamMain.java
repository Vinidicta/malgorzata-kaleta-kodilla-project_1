package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier beautifier = new PoemBeautifier();
        beautifier.beautify("texting", (text) -> toUpperCase(text));
        beautifier.beautify("texting", (text) -> "ABC" + text + "ABC");
        beautifier.beautify("texting", (text) -> text.replace('t', 'a'));
        beautifier.beautify("texting", (text -> text+new Random().nextInt(50)));

        System.out.println();

        Forum forum = new Forum();
        Map<Integer, ForumUser> resultMapOfForumUsers = forum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().getYear()<2000)
                .filter(forumUser -> forumUser.getPostsNumber()!=0)
                .collect(Collectors.toMap(ForumUser::getIdNumber, forumUser -> forumUser));

        System.out.println("# elements: " + resultMapOfForumUsers.size());
        resultMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);






    }
}

