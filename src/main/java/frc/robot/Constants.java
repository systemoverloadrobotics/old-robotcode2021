/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class CONSTANTS {
    //General Constants
    public static final int PCM_ID = 3;

    //Constants for motor controllers in DriveTrain
    public static final class DRIVE {
        public static final int FORWARD_CHANNEL_ID = 2;
        public static final int REVERSE_CHANNEL_ID = 3;
        public static final int RIGHT_MASTER_ID = 4;
        public static final int RIGHT_FOLLOWER_1_ID = 5;
        public static final int RIGHT_FOLLOWER_2_ID = 6;
        public static final int LEFT_MASTER_ID = 7;
        public static final int LEFT_FOLLOWER_1_ID = 8;
        public static final int LEFT_FOLLOWER_2_ID = 9;
        public static final double SPEED_MULTIPLIER = 0.6;
        public static final double TURN_MULTIPLIER = 0.4;
    }
    //Constants for the joystick controls
    public static final class CONTROLS {
        public static final int JOYSTICK_PORT = 0;
        public static final int ARCADE_JOYSTICK_PORT = 1;

        public static final class JOYSTICK {
            public static final int TRIGGER = 1;  // BUTTON
            public static final int THUMB = 2;    // BUTTON

            public static final int THROTTLE = 3; // AXIS
            public static final int X = 0;        // AXIS
            public static final int Y = 1;        // AXIS
            public static final int Z = 2;        // AXIS

            public static final class TOP {
                public static final int RIGHT_TOP = 6;  // BUTTON
                public static final int RIGHT_BOT = 4;  // BUTTON
                public static final int LEFT_TOP = 5;   // BUTTON
                public static final int LEFT_BOT = 3;   // BUTTON
            }

            public static final class SIDE {
                public static final int BUTTON_7 = 7;   // BUTTON
                public static final int BUTTON_8 = 8;   // BUTTON
                public static final int BUTTON_9 = 9;   // BUTTON
                public static final int BUTTON_10 = 10; // BUTTON
                public static final int BUTTON_11 = 11; // BUTTON
                public static final int BUTTON_12 = 12; // BUTTON
            }

            public static final class POV {
                public static final int ID = 0;          // POV
                public static final int TOP = 0;         // POV
                public static final int TOP_RIGHT = 45;  // POV
                public static final int RIGHT = 90;      // POV
                public static final int RIGHT_BOT = 135; // POV
                public static final int BOT = 180;       // POV
                public static final int LEFT_BOT = 225;  // POV
                public static final int LEFT = 270;      // POV
                public static final int LEFT_TOP = 315;  // POV
            }
        }

        public static final class ARCADE {
            public static final int A = 1;        // BUTTON
            public static final int B = 2;        // BUTTON
            public static final int X = 3;        // BUTTON
            public static final int Y = 4;        // BUTTON
            public static final int L1 = 5;       // BUTTON
            public static final int R1 = 6;       // BUTTON
            public static final int TOP_LEFT = 8; // BUTTON

            public static final int R2 = 3;       // AXIS
            public static final int L2 = 2;       // AXIS

            public static final class POV {
                public static final int ID = 0;          // POV
                public static final int TOP = 0;         // POV
                public static final int TOP_RIGHT = 45;  // POV
                public static final int RIGHT = 90;      // POV
                public static final int RIGHT_BOT = 135; // POV
                public static final int BOT = 180;       // POV
                public static final int LEFT_BOT = 225;  // POV
                public static final int LEFT = 270;      // POV
                public static final int LEFT_TOP = 315;  // POV
            }
        }
    }
}
