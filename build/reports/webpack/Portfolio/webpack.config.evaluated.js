{
  mode: 'development',
  resolve: {
    modules: [
      'node_modules'
    ]
  },
  plugins: [
    TeamCityErrorPlugin {}
  ],
  module: {
    rules: [
      {
        test: /\.js$/,
        use: [
          'source-map-loader'
        ],
        enforce: 'pre'
      }
    ]
  },
  entry: {
    main: [
      '/Users/r-yagi/IdeaProjects/JetpackComposePortfolio/build/js/packages/Portfolio/kotlin/Portfolio.js'
    ]
  },
  output: {
    path: '/Users/r-yagi/IdeaProjects/JetpackComposePortfolio/build/distributions',
    filename: [Function: filename],
    library: 'Portfolio',
    libraryTarget: 'umd',
    globalObject: 'this'
  },
  devtool: 'eval-source-map',
  stats: {
    warningsFilter: [
      /Failed to parse source map/
    ],
    warnings: false,
    errors: false
  },
  devServer: {
    open: true,
    contentBase: [
      '/Users/r-yagi/IdeaProjects/JetpackComposePortfolio/build/processedResources/js/main'
    ]
  }
}