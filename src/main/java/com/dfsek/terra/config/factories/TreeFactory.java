package com.dfsek.terra.config.factories;

import com.dfsek.tectonic.exception.LoadException;
import com.dfsek.terra.Terra;
import com.dfsek.terra.config.templates.TreeTemplate;
import com.dfsek.terra.generation.items.tree.TerraTree;
import org.polydev.gaea.tree.Tree;

public class TreeFactory implements TerraFactory<TreeTemplate, Tree> {
    @Override
    public Tree build(TreeTemplate config, Terra main) throws LoadException {
        return new TerraTree(config.getSpawnable(), config.getyOffset(), config.getStructures());
    }
}
