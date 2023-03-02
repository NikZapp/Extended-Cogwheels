package com.rabbitminers.extendedgears.registry;

import com.jozufozu.flywheel.core.PartialModel;
import com.rabbitminers.extendedgears.base.data.MetalCogwheel;
import com.rabbitminers.extendedgears.base.data.WoodenCogwheel;
import com.simibubi.create.AllBlockPartials;
import com.simibubi.create.Create;

import java.util.EnumMap;
import java.util.Map;

public class ExtendedCogwheelsPartials {
    public static final Map<MetalCogwheel, PartialModel> METAL_COGWHEELS = new EnumMap<>(MetalCogwheel.class);
    public static final Map<WoodenCogwheel, PartialModel> WOODEN_COGWHEELS = new EnumMap<>(WoodenCogwheel.class);

    static {
        for (MetalCogwheel metalCogwheel : MetalCogwheel.values())
            METAL_COGWHEELS.put(metalCogwheel, block("block/cogwheel/" + metalCogwheel.name()));

        for (WoodenCogwheel woodenCogwheel : WoodenCogwheel.values())
            WOODEN_COGWHEELS.put(woodenCogwheel, block("block/cogwheel/" + woodenCogwheel.name()));
    }

    private static PartialModel block(String path) {
        return new PartialModel(Create.asResource("block/" + path));
    }
    public static void init() {

    }
}
