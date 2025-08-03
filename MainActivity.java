package com.example.genzstoryapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    StoryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Step 1: Create an ArrayList (mutable list)
        List<StoryModel> stories = new ArrayList<>();

        // Step 2: Add stories to the list
        stories.add(new StoryModel(
                "The Lion and the Mouse",
                R.drawable.lion_mouse,
                "Once upon a time in a dense forest, a lion was sleeping peacefully. Suddenly, a little mouse started running up and down on his body. "
                        + "The lion woke up angrily and caught the mouse with his big paw.\n\n"
                        + "The mouse begged, “Please let me go! I promise I’ll help you one day.” The lion laughed at the idea but was kind enough to let him go.\n\n"
                        + "A few days later, the lion was trapped in a hunter's net. He roared for help. Hearing this, the mouse rushed to the spot and quickly gnawed "
                        + "the net with his sharp teeth, setting the lion free.\n\n"
                        + "👉 Moral: Even the smallest friend can be the biggest help."
        ));

        stories.add(new StoryModel(
                "The Thirsty Crow",
                R.drawable.thirsty_crow,
                "One hot summer day, a thirsty crow was flying around in search of water. After searching for a long time, he saw a pot with a little water at the bottom.\n\n"
                        + "The crow tried to drink the water, but it was too low for his beak to reach. He looked around and saw some small pebbles. One by one, he dropped the pebbles into the pot. "
                        + "Slowly, the water rose to the top.\n\n"
                        + "The crow drank the water happily and flew away.\n\n"
                        + "👉 Moral: Where there's a will, there's a way."
        ));
        stories.add(new StoryModel(
                "The Fox and the Grapes",
                R.drawable.fox_grapes,
                "One hot summer day, a hungry fox was roaming in search of food. He spotted a bunch of juicy grapes hanging high on a vine. "
                        + "The grapes looked ripe and delicious.\n\n"
                        + "The fox jumped and jumped, but no matter how hard he tried, he could not reach the grapes. After several attempts, tired and frustrated, "
                        + "he walked away saying, “Those grapes are probably sour and not worth eating.”\n\n"
                        + "👉 Moral: It’s easy to despise what you cannot have."
        ));

        stories.add(new StoryModel(
                "The Boy Who Cried Wolf",
                R.drawable.boy_wolf,
                "There was once a shepherd boy who tended a flock of sheep near a village. Bored and wanting attention, he shouted, “Wolf! Wolf! A wolf is attacking the sheep!”\n\n"
                        + "Villagers ran to help, but found no wolf. The boy laughed at the trick. He repeated this prank several times.\n\n"
                        + "One day, a real wolf appeared and started attacking the sheep. The boy cried out loudly, but this time no one believed him. "
                        + "The wolf scattered the flock and the boy learned a painful lesson.\n\n"
                        + "👉 Moral: Liars are not believed even when they tell the truth."
        ));
        stories.add(new StoryModel(
                "The Ant and the Grasshopper",
                R.drawable.ant_grasshopper,
                "During the warm summer, the hardworking ant collected grains and stored food carefully for the winter ahead. "
                        + "Meanwhile, the carefree grasshopper sang and played all day without worrying about the future.\n\n"
                        + "When winter came, the grasshopper found itself hungry and cold with no food to eat. He went to the ant for help, but the ant reminded him to prepare during good times.\n\n"
                        + "👉 Moral: Hard work and planning today ensures comfort tomorrow."
        ));
        stories.add(new StoryModel(
                "The Tortoise and the Hare",
                R.drawable.tortoise_hare,
                "A speedy hare was very proud of his running skills and often mocked the slow-moving tortoise. One day, they decided to race.\n\n"
                        + "The hare sprinted ahead but became so confident that he stopped to rest and soon fell asleep. The tortoise, moving slowly but steadily, passed the sleeping hare and crossed the finish line first.\n\n"
                        + "The hare woke up too late to catch up.\n\n"
                        + "👉 Moral: Slow and steady wins the race."
        ));
        stories.add(new StoryModel(
                "The Honest Woodcutter",
                R.drawable.honest_woodcutter,
                "A poor woodcutter was cutting wood near a river when his axe slipped from his hand and fell into the deep water. He sat down sadly, not knowing how to retrieve it.\n\n"
                        + "Suddenly, a fairy appeared and asked what happened. The woodcutter explained and the fairy dived into the river and brought out a golden axe. "
                        + "The woodcutter honestly said, “That is not my axe.”\n\n"
                        + "The fairy then brought out a silver axe, but again he refused.\n\n"
                        + "Finally, the fairy brought out the woodcutter’s real axe. Happy with his honesty, the fairy gifted him all three axes.\n\n"
                        + "👉 Moral: Honesty is the best policy."
        ));
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new StoryAdapter(stories, this);
        recyclerView.setAdapter(adapter);
    }
}
