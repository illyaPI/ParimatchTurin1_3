package com.mat.paris.mar.com.importantturin

import com.mat.paris.mar.com.importantturin.modelsturin.BinomLinkTurin

interface RepositoryTurin {

  var binomLinkTurin: BinomLinkTurin?
  var whiteBaseTurin: String
  var blackBaseTurin: String?
  var defaultKeyTurin: String

  var lastBinomLinkTurin: String?
}