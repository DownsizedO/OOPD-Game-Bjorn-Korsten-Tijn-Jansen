module brandweermanMark {
    requires hanyaeger;
    requires org.checkerframework.checker.qual;

    exports com.github.hanyaeger.Brandweerman_Mark;

    opens audio;
    opens backgrounds;
    opens sprites;
    opens player_sprites;
}
