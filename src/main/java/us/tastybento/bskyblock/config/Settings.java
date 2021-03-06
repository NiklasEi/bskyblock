package us.tastybento.bskyblock.config;

import java.util.HashMap;
import java.util.List;

import org.bukkit.block.Biome;
import org.bukkit.entity.EntityType;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;

import us.tastybento.bskyblock.database.BSBDatabase.DatabaseType;
import us.tastybento.bskyblock.database.managers.OfflineHistoryMessages.HistoryMessageType;
import us.tastybento.bskyblock.database.objects.Island.SettingsFlag;

/**
 * All the plugin settings are here
 * @author Tastybento
 */
public class Settings {
    /* The settings variables should follow the config order */
    

    // Constants
    // Game Type BSKYBLOCK or ACIDISLAND
    public enum GameType {
        BSKYBLOCK, ACIDISLAND
    }
    /*
    public final static GameType GAMETYPE = GameType.ACIDISLAND;
    // The spawn command (Essentials spawn for example)
    public final static String SPAWNCOMMAND = "spawn";
    // Permission prefix
    public final static String PERMPREFIX = "acidisland.";
    // The island command
    public final static String ISLANDCOMMAND = "ai";
    // The challenge command
    public static final String CHALLENGECOMMAND = "aic";
    // Admin command
    public static final String ADMINCOMMAND = "acid";
    */
    public final static GameType GAMETYPE = GameType.BSKYBLOCK;
    // Permission prefix
    public final static String PERMPREFIX = "bskyblock.";
    // The island command
    public final static String ISLANDCOMMAND = "island";
    // The challenge command
    public static final String CHALLENGECOMMAND = "bsc";
    // The spawn command (Essentials spawn for example)
    public final static String SPAWNCOMMAND = "spawn";
    // Admin command
    public static final String ADMINCOMMAND = "bsadmin";
    
    /*      GENERAL     */
    public static boolean metrics;
    public static boolean checkUpdates;
    public static String defaultLanguage;
    public static boolean useEconomy;
    public static double startingMoney;
    public static boolean useControlPanel;
    
    // Purge
    public static int purgeMaxIslandLevel;
    public static boolean purgeRemoveUserData;
    
    // TODO Database 
    public static int databaseBackupPeriod;
    
    public static boolean recoverSuperFlat;
    public static boolean muteDeathMessages;
    public static boolean ftbAutoActivator;
    public static boolean allowObsidianScooping;
    
    // Teleport
    public static boolean fallingAllowTeleport;
    public static List<String> fallingBlockedCommands;
    public static boolean acidAllowTeleport;
    public static List<String> acidBlockedCommands;
    
    /*      WORLD       */
    public static String worldName;
    public static int islandDistance;
    public static int islandProtectionRange;
    public static int startX;
    public static int startZ;
    public static int seaHeight;
    public static int islandHeight;
    public static int maxIslands;
    
    // Nether
    public static boolean netherGenerate;
    public static boolean netherIslands;
    public static boolean netherTrees;
    public static boolean netherRoof;
    public static int netherSpawnRadius;
    
    // Entities
    public static int spawnLimitMonsters;
    public static int spawnLimitAnimals;
    public static int spawnLimitWaterAnimals;
    public static HashMap<EntityType, Integer> entityLimits;
    public static HashMap<String, Integer> tileEntityLimits;

    /*      ISLAND      */
    public static int maxTeamSize;
    public static int maxHomes;
    public static int nameMinLength;
    public static int nameMaxLength;
    public static int inviteWait;
    
    // Reset
    public static int resetLimit;
    public static int resetWait;
    public static boolean leaversLoseReset;
    public static boolean kickedKeepInventory;
    public static boolean onJoinResetMoney;
    public static boolean onJoinResetInventory;
    public static boolean onJoinResetEnderChest;
    public static boolean onLeaveResetMoney;
    public static boolean onLeaveResetInventory;
    public static boolean onLeaveResetEnderChest;
    
    // Remove mobs
    public static boolean removeMobsOnLogin;
    public static boolean removeMobsOnIsland;
    public static List<String> removeMobsWhitelist;
    
    public static boolean makeIslandIfNone;
    public static boolean immediateTeleportOnIsland;
    public static boolean respawnOnIsland;
    public static boolean onlyLeaderCanCoop;
    
    // Chats
    public static boolean teamchatUse;
    public static boolean teamchatLog;
    public static boolean teamchatIncludeTrust;
    public static boolean teamchatIncludeCoop;
    //TODO island chat
    
    public static boolean confirmKick;
    public static int confirmKickWait;
    public static boolean confirmLeave;
    public static int confirmLeaveWait;
    public static boolean confirmReset;
    public static int confirmResetWait;
    
    // Deaths
    public static int deathsMax;
    public static boolean deathsSumTeam;
    
    /*      PROTECTION      */
    public static boolean allowPistonPush;
    public static boolean restrictWither;
    
    // Invincible visitors
    public static boolean invincibleVisitor;
    public static List<DamageCause> invincibleVisitorOptions;
    
    public static List<String> visitorBannedCommands;
    public static int togglePvPCooldown;
    
    //TODO flags
    
    /*      ACID        */
    public static boolean acidDamageOp;
    public static boolean acidDamageChickens;
    
    // Damage
    public static int acidDamagePlayer;
    public static int acidDamageMonster;
    public static int acidDamageAnimal;
    public static int acidDestroyItemTime;
    public static int acidRainDamage;
    public static List<PotionEffectType> acidEffects;
    
    // Protection
    public static boolean acidHelmetProtection;
    public static boolean acidFullArmorProtection;
    
    /*      SCHEMATICS      */
    public static List<String> companionNames;
    public static ItemStack[] chestItems;
    public static Biome defaultBiome;
    public static boolean usePhysics;
    public static EntityType companionType;
    public static boolean useSchematicPanel;
    public static boolean chooseIslandRandomly;
    
    // TODO added this just to avoid compilation errors, but will be changed in the future
    public static List<HistoryMessageType> historyMessagesTypes;

    // Database settings
    public static DatabaseType databaseType;
    public static String dbHost;
    public static int dbPort;
    public static String dbName;
    public static String dbUsername;
    public static String dbPassword;

    public static boolean useOwnGenerator;

    public static boolean endGenerate;

    public static boolean endIslands;
    public static boolean resetMoney;
    public static double acidDamage;
    public static int islandXOffset;
    public static int islandStartX;
    public static int islandZOffset;
    public static int islandStartZ;

    public static boolean logInRemoveMobs;
    public static HashMap<SettingsFlag, Boolean> defaultWorldSettings;
    public static boolean allowEndermanGriefing;
    public static boolean endermanDeathDrop;
    public static boolean allowTNTDamage;
    public static boolean allowChestDamage;
    public static boolean allowCreeperDamage;
    public static boolean allowCreeperGriefing;
    public static boolean allowAutoActivator;
    public static boolean allowMobDamageToItemFrames;
    public static HashMap<String,Integer> limitedBlocks;
    public static boolean allowTNTPushing;
    public static boolean showInActionBar;
    public static boolean teamJoinDeathReset;
    public static long leaveConfirmWait;
    public static boolean leaveConfirmation;

}
