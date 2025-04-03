module brandweermanMark {
    requires hanyaeger;
    requires org.checkerframework.checker.qual;
    requires com.google.errorprone.annotations;

    exports com.github.hanyaeger.Brandweerman_Mark;

    opens audio;
    opens backgrounds;
    opens sprites;
    opens player_sprites;
    opens rooms;
    opens enemy_sprites;
    opens modifier_sprites;
}
