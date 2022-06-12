let config = {
  mode: 'development',
  resolve: {
    modules: [
      "node_modules"
    ]
  },
  plugins: [],
  module: {
    rules: []
  }
};

// entry
config.entry = {
    main: ["/Users/r-yagi/IdeaProjects/JetpackComposePortfolio/build/js/packages/Portfolio/kotlin/Portfolio.js"]
};

config.output = {
    path: "/Users/r-yagi/IdeaProjects/JetpackComposePortfolio/build/distributions",
    filename: (chunkData) => {
        return chunkData.chunk.name === 'main'
            ? "Portfolio.js"
            : "Portfolio-[name].js";
    },
    library: "Portfolio",
    libraryTarget: "umd",
    globalObject: "this"
};

// source maps
config.module.rules.push({
        test: /\.js$/,
        use: ["source-map-loader"],
        enforce: "pre"
});
config.devtool = 'eval-source-map';

config.stats = config.stats || {}
Object.assign(config.stats, config.stats, {
    warningsFilter: [/Failed to parse source map/]
})


// dev server
config.devServer = {
  "open": true,
  "contentBase": [
    "/Users/r-yagi/IdeaProjects/JetpackComposePortfolio/build/processedResources/js/main"
  ]
};

// noinspection JSUnnecessarySemicolon
;(function(config) {
    const tcErrorPlugin = require('kotlin-test-js-runner/tc-log-error-webpack');
    config.plugins.push(new tcErrorPlugin())
    config.stats = config.stats || {}
    Object.assign(config.stats, config.stats, {
        warnings: false,
        errors: false
    })
})(config);
// save evaluated config file
;(function(config) {
    const util = require('util');
    const fs = require('fs');
    const evaluatedConfig = util.inspect(config, {showHidden: false, depth: null, compact: false});
    fs.writeFile("/Users/r-yagi/IdeaProjects/JetpackComposePortfolio/build/reports/webpack/Portfolio/webpack.config.evaluated.js", evaluatedConfig, function (err) {});
})(config);

module.exports = config
